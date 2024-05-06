package com.win.work.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.win.common.constants.Constants;
import com.win.common.util.UtilFunction;


@Controller
public class CodeController {

	@Autowired
	CodeService service;
	
//	전체리스트
	@RequestMapping(value = "/codeSdmList")
	public String codeListSdm(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
		UtilFunction.setSearch(vo);
		model.addAttribute("list", service.selectList(vo));
		return Constants.PATH_CODE + "codeSdmList";
	}
	
//	등록화면
	@RequestMapping(value = "/codeSdmCreate")
	public String codeSdmCreate(CodeDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));	
		return Constants.PATH_CODE + "codeSdmCreate";
	}
	
//	수정화면
	@RequestMapping(value = "/codeSdmForm")
	public String codeSdmForm(CodeDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));	
		return Constants.PATH_CODE + "codeSdmForm";
	}
	
//	그룹코드등록
	@RequestMapping(value = "/codeSdmInsert")
	public String codeSdmInsert(CodeDto dto) throws Exception {
		service.insert(dto);
		return "redirect:/codeSdmList";
	}
	
//	그룹코드수정
	@RequestMapping(value = "/codeSdmUpdate")
	public String codeSdmUpdate(CodeDto dto) throws Exception {
		service.update(dto);
		return "redirect:/codeSdmList";	
	}	
	
//	그룹코드삭제
	@RequestMapping(value = "/codeSdmDelete")
	public String codeSdmDelete(CodeDto dto) throws Exception {
		service.delete(dto);
		return "redirect:/codeSdmList";
	}
	
//	그룹코드 삭제여부 변경
	@RequestMapping(value = "/codeSdmUdtDelNy")
	public String codeSdmUdtDelNy(CodeDto dto) throws Exception {
		service.updateDelNy(dto);
		return "redirect:/codeSdmList";
	}
	
}
