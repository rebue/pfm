package rebue.pfm.ro;
import rebue.pfm.mo.PfmFuncMo;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(Include.NON_NULL)
public class PfmFuncRo {
    /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     *	1:成功  -1:失败 
     */
	private Byte result;
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	private String msg ;
	
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	private PfmFuncMo record;
	
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	public Byte getResult() {
		return result;
	}
  	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	public void setResult(Byte result) {
		this.result = result;
	}
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	public String getMsg() {
		return msg;
	}
	
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	public PfmFuncMo getRecord() {
		return record;
	}
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	public void setRecord( PfmFuncMo record) {
		this.record = record;
	}
	 /**
     *	This field was generated by MyBatis Generator.
     * 
     *	@mbg.generated
     *
     * 
     */
	@Override
	public String toString() {
		return "PfmSysTo [result=" + result + ", msg=" + msg + ", record=" + record + "]";
	}
	

}