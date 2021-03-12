package solution.first.vo;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import common.CommonsVo;

@Alias("analysisVo")
public class FirstVo extends CommonsVo implements Serializable{
	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private String anl_vd_type;			//타입
	public String getAnl_vd_type() {
		return anl_vd_type;
	}
	public void setAnl_vd_type(String anl_vd_type) {
		this.anl_vd_type = anl_vd_type;
	}

	private int anl_vd_no;			//no
	private String anl_vd_list_sj;	//목차용 제목
	private String anl_vd_list_cn;	//목차용 기능
	private String anl_vd_sj;		//제목
	private String anl_vd_cn;		//기능
	private String anl_vd_url;		//URL
	private String anl_vd_realurl;		//URL
	private String anl_vd_use_mth;	//사용방법
	private String anl_sample_code;	//샘플코드
	private String anl_data_frmat;	//데이터포맷
	private String anl_input_img;	//입력이미지
	private String anl_output_img;	//출력이미지
	private String rgsde;			//등록일
	private int anl_vd_cnt; 		//개수
	private String analysis_vd_delete; 		//삭제 여부
	private String anl_icon_nm;
	private String anl_dalda_use;      // 달다 사용여부
	
	public String getAnl_vd_realurl() {
		return anl_vd_realurl;
	}
	public void setAnl_vd_realurl(String anl_vd_realurl) {
		this.anl_vd_realurl = anl_vd_realurl;
	}
	public String getAnl_dalda_use() {
		return anl_dalda_use;
	}
	public void setAnl_dalda_use(String anl_dalda_use) {
		this.anl_dalda_use = anl_dalda_use;
	}
	public String getAnl_icon_nm() {
		return anl_icon_nm;
	}
	public void setAnl_icon_nm(String anl_icon_nm) {
		this.anl_icon_nm = anl_icon_nm;
	}
	public String getAnalysis_vd_delete() {
		return analysis_vd_delete;
	}
	public void setAnalysis_vd_delete(String analysis_vd_delete) {
		this.analysis_vd_delete = analysis_vd_delete;
	}

	private int anl_vd_input_no;	
	private int anl_vd_input_idx;
	private String anl_vd_input_nm; 
	private String anl_vd_input_ty; 
	private String anl_vd_input_dc; 
	private String anl_vd_input_ex; 
	private int anl_vd_i_cnt; 		
	
	private int anl_vd_output_no;
	private int anl_vd_output_idx;
	private String anl_vd_output_nm;
	private String anl_vd_output_ty;
	private String anl_vd_output_dc;
	private String anl_vd_output_ex;
	private int anl_vd_o_cnt; 	
	
	private int anl_file_cnt;
	private int anl_file_no;
	private int anl_file_idx;
	private String anl_file_dv;
	private String anl_file_nm;
	private String anl_file_ornm;
	private String anl_file_pth;
	
	private int tag_id;
	private String tag_value;
	private String tag_name;
	private String tag_dscrp;
	
	public String getTag_value() {
		return tag_value;
	}
	public void setTag_value(String tag_value) {
		this.tag_value = tag_value;
	}

	private String api_key;
	private String user_id;
	private String grup_id;
	private String cnfcnt;
	private String allcnfcnt;
	private String cnfcntnm;
	
	
	

	
	public String getCnfcntnm() {
		return cnfcntnm;
	}
	public void setCnfcntnm(String cnfcntnm) {
		this.cnfcntnm = cnfcntnm;
	}
	public String getGrup_id() {
		return grup_id;
	}
	public String getCnfcnt() {
		return cnfcnt;
	}
	public void setCnfcnt(String cnfcnt) {
		this.cnfcnt = cnfcnt;
	}
	public String getAllcnfcnt() {
		return allcnfcnt;
	}
	public void setAllcnfcnt(String allcnfcnt) {
		this.allcnfcnt = allcnfcnt;
	}
	public void setGrup_id(String grup_id) {
		this.grup_id = grup_id;
	}
	public String getApi_key() {
		return api_key;
	}
	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	public String getTag_dscrp() {
		return tag_dscrp;
	}
	public void setTag_dscrp(String tag_dscrp) {
		this.tag_dscrp = tag_dscrp;
	}
	public int getAnl_file_idx() {
		return anl_file_idx;
	}
	public void setAnl_file_idx(int anl_file_idx) {
		this.anl_file_idx = anl_file_idx;
	}
	public String getAnl_file_dv() {
		return anl_file_dv;
	}
	public void setAnl_file_dv(String anl_file_dv) {
		this.anl_file_dv = anl_file_dv;
	}
	public int getAnl_file_cnt() {
		return anl_file_cnt;
	}
	public void setAnl_file_cnt(int anl_file_cnt) {
		this.anl_file_cnt = anl_file_cnt;
	}
	public int getAnl_file_no() {
		return anl_file_no;
	}
	public void setAnl_file_no(int anl_file_no) {
		this.anl_file_no = anl_file_no;
	}
	public String getAnl_file_nm() {
		return anl_file_nm;
	}
	public void setAnl_file_nm(String anl_file_nm) {
		this.anl_file_nm = anl_file_nm;
	}
	public String getAnl_file_ornm() {
		return anl_file_ornm;
	}
	public void setAnl_file_ornm(String anl_file_ornm) {
		this.anl_file_ornm = anl_file_ornm;
	}
	public String getAnl_file_pth() {
		return anl_file_pth;
	}
	public void setAnl_file_pth(String anl_file_pth) {
		this.anl_file_pth = anl_file_pth;
	}
	public int getAnl_vd_cnt() {
		return anl_vd_cnt;
	}
	public void setAnl_vd_cnt(int anl_vd_cnt) {
		this.anl_vd_cnt = anl_vd_cnt;
	}
	public int getAnl_vd_i_cnt() {
		return anl_vd_i_cnt;
	}
	public void setAnl_vd_i_cnt(int anl_vd_i_cnt) {
		this.anl_vd_i_cnt = anl_vd_i_cnt;
	}
	public int getAnl_vd_o_cnt() {
		return anl_vd_o_cnt;
	}
	public void setAnl_vd_o_cnt(int anl_vd_o_cnt) {
		this.anl_vd_o_cnt = anl_vd_o_cnt;
	}
	public int getAnl_vd_no() {
		return anl_vd_no;
	}
	public void setAnl_vd_no(int anl_vd_no) {
		this.anl_vd_no = anl_vd_no;
	}
	
	public String getAnl_vd_list_sj() {
		return anl_vd_list_sj;
	}
	public void setAnl_vd_list_sj(String anl_vd_list_sj) {
		this.anl_vd_list_sj = anl_vd_list_sj;
	}
	public String getAnl_vd_list_cn() {
		return anl_vd_list_cn;
	}
	public void setAnl_vd_list_cn(String anl_vd_list_cn) {
		this.anl_vd_list_cn = anl_vd_list_cn;
	}
	public String getAnl_vd_sj() {
		return anl_vd_sj;
	}
	public void setAnl_vd_sj(String anl_vd_sj) {
		this.anl_vd_sj = anl_vd_sj;
	}
	public String getAnl_vd_cn() {
		return anl_vd_cn;
	}
	public void setAnl_vd_cn(String anl_vd_cn) {
		this.anl_vd_cn = anl_vd_cn;
	}
	public String getAnl_vd_url() {
		return anl_vd_url;
	}
	public void setAnl_vd_url(String anl_vd_url) {
		this.anl_vd_url = anl_vd_url;
	}
	public String getAnl_vd_use_mth() {
		return anl_vd_use_mth;
	}
	public void setAnl_vd_use_mth(String anl_vd_use_mth) {
		this.anl_vd_use_mth = anl_vd_use_mth;
	}
	public String getAnl_sample_code() {
		return anl_sample_code;
	}
	public void setAnl_sample_code(String anl_sample_code) {
		this.anl_sample_code = anl_sample_code;
	}
	public String getAnl_data_frmat() {
		return anl_data_frmat;
	}
	public void setAnl_data_frmat(String anl_data_frmat) {
		this.anl_data_frmat = anl_data_frmat;
	}
	public String getAnl_input_img() {
		return anl_input_img;
	}
	public void setAnl_input_img(String anl_input_img) {
		this.anl_input_img = anl_input_img;
	}
	public String getAnl_output_img() {
		return anl_output_img;
	}
	public void setAnl_output_img(String anl_output_img) {
		this.anl_output_img = anl_output_img;
	}
	public String getRgsde() {
		return rgsde;
	}
	public void setRgsde(String rgsde) {
		this.rgsde = rgsde;
	}
	public int getAnl_vd_input_no() {
		return anl_vd_input_no;
	}
	public void setAnl_vd_input_no(int anl_vd_input_no) {
		this.anl_vd_input_no = anl_vd_input_no;
	}
	public int getAnl_vd_input_idx() {
		return anl_vd_input_idx;
	}
	public void setAnl_vd_input_idx(int anl_vd_input_idx) {
		this.anl_vd_input_idx = anl_vd_input_idx;
	}
	public String getAnl_vd_input_nm() {
		return anl_vd_input_nm;
	}
	public void setAnl_vd_input_nm(String anl_vd_input_nm) {
		this.anl_vd_input_nm = anl_vd_input_nm;
	}
	public String getAnl_vd_input_ty() {
		return anl_vd_input_ty;
	}
	public void setAnl_vd_input_ty(String anl_vd_input_ty) {
		this.anl_vd_input_ty = anl_vd_input_ty;
	}
	public String getAnl_vd_input_dc() {
		return anl_vd_input_dc;
	}
	public void setAnl_vd_input_dc(String anl_vd_input_dc) {
		this.anl_vd_input_dc = anl_vd_input_dc;
	}
	public String getAnl_vd_input_ex() {
		return anl_vd_input_ex;
	}
	public void setAnl_vd_input_ex(String anl_vd_input_ex) {
		this.anl_vd_input_ex = anl_vd_input_ex;
	}
	public int getAnl_vd_output_no() {
		return anl_vd_output_no;
	}
	public void setAnl_vd_output_no(int anl_vd_output_no) {
		this.anl_vd_output_no = anl_vd_output_no;
	}
	public int getAnl_vd_output_idx() {
		return anl_vd_output_idx;
	}
	public void setAnl_vd_output_idx(int anl_vd_output_idx) {
		this.anl_vd_output_idx = anl_vd_output_idx;
	}
	public String getAnl_vd_output_nm() {
		return anl_vd_output_nm;
	}
	public void setAnl_vd_output_nm(String anl_vd_output_nm) {
		this.anl_vd_output_nm = anl_vd_output_nm;
	}
	public String getAnl_vd_output_ty() {
		return anl_vd_output_ty;
	}
	public void setAnl_vd_output_ty(String anl_vd_output_ty) {
		this.anl_vd_output_ty = anl_vd_output_ty;
	}
	public String getAnl_vd_output_dc() {
		return anl_vd_output_dc;
	}
	public void setAnl_vd_output_dc(String anl_vd_output_dc) {
		this.anl_vd_output_dc = anl_vd_output_dc;
	}
	public String getAnl_vd_output_ex() {
		return anl_vd_output_ex;
	}
	public void setAnl_vd_output_ex(String anl_vd_output_ex) {
		this.anl_vd_output_ex = anl_vd_output_ex;
	}
	
	
	
	
}
