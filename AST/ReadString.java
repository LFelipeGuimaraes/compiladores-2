/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

public class ReadString extends Expr {
    public ReadString(){
      this.setType(new StringType());
    }
    public void genC();
}
