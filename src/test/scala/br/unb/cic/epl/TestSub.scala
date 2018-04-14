package br.unb.cic.epl
import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter
class TestSub  extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

    behavior of "An Sub expression"

    var literal250: Eval.Literal = _
    var literal900: Eval.Literal = _

    before {
      literal250 = new Core.Literal(250) with Eval.Literal
      literal900 = new Core.Literal(900) with Eval.Literal
    }

    it should "return String (900 - 250) when we call Sub(Literal(900), Literal(250).print())" in {
      val sub = new SubEval.Sub(literal900, literal250)

      sub.print() should be ("(900 - 250)")
    }

    it should "return 650 when we call call Sub(Literal(900), Literal(250)).eval()" in {
      val sub = new SubEval.Sub(literal900, literal250)

      sub.eval() should be (650)
    }
  }


