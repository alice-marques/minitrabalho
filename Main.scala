import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Sub
import br.unb.cic.epl.SubEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new Add.Add(lit100, lit500) 

  println(sum.print())
  println(lit100.eval())

  val lit400 = new Core.Literal(400) with Eval.Literal
  val lit200 = new Core.Literal(200) with Eval.Literal

  val subt = new Sub.Sub(lit400, lit200)

  println(subt.print())
  println(lit400.eval())
}
