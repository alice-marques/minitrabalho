package br.unb.cic.epl
import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter
class TestMult  extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mult expression"

  var literal5: Eval.Literal = _
  var literal10: Eval.Literal = _

  before {
    literal5 = new Core.Literal(5) with Eval.Literal
    literal10 = new Core.Literal(10) with Eval.Literal
  }

  it should "return String (5 * 10) when we call Mult(Literal(5), Literal(10).print())" in {
    val mult = new MultEval.Mult(literal5, literal10)

    mult.print() should be ("(5 * 10)")
  }

  it should "return 50 when we call call Mult(Literal(5), Literal(10)).eval()" in {
    val mult = new MultEval.Mult(literal5, literal10)

    mult.eval() should be (50)
  }
}