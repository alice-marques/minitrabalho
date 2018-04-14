import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.Sub
import br.unb.cic.epl.Mult
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.MultEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal
  val lit900 = new Core.Literal(900) with Eval.Literal
  val lit250 = new Core.Literal(250) with Eval.Literal
  val lit5 = new Core.Literal(5) with Eval.Literal
  val lit10 = new Core.Literal(10) with Eval.Literal

  val sum = new Add.Add(lit100, lit500)
  val sub = new Sub.Sub(lit900, lit250)
  val mult = new Mult.Mult(lit5, lit10)
  val sumeval = new AddEval.Add(lit100, lit500)
  val subeval = new SubEval.Sub(lit900, lit250)
  val multeval = new MultEval.Mult(lit5, lit10)

  println(sum.print())
  println(sumeval.eval())
  println(sub.print())
  println(subeval.eval())
  println(mult.print())
  println(multeval.eval())
}
