package com.crts.app.hm.main.service;

import java.util.ArrayList;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.BranchAllDto;
import com.crts.app.hm.main.dto.BranchIdDto;
import com.crts.app.hm.main.dto.BranchNameDto;
import com.crts.app.hm.main.model.Address;
import com.crts.app.hm.main.model.Branch;
import com.crts.app.hm.main.model.UserDetails;
import com.crts.app.hm.main.repository.IbranchRepository;
import com.crts.app.hm.main.repository.UserDetailsRepository;

@Service
public class ServiceImpl implements IService {

	@Autowired
	IbranchRepository ibr;
	
	@Autowired
	UserDetailsRepository ur;

	public BranchAllDto getBranchById(int id) {
		System.out.println("BAD" + id);
		Branch branch = ibr.findById(id).get();

		System.out.println("Branch" + branch.getBranchAddress());
		ModelMapper mm = new ModelMapper();
		BranchAllDto branchdto = mm.map(branch, BranchAllDto.class);

		System.out.println("BranchDTO" + branchdto);

		return branchdto;
	}

	@Override
	public BranchAllDto getBranchByName(String branchName) {

		Branch branch = ibr.findByName(branchName);
		ModelMapper mm = new ModelMapper();
		BranchAllDto branchAllDto = mm.map(branch, BranchAllDto.class);
		return branchAllDto;
	}

	@Override
	public List<BranchAllDto> getBranchAll() {
		List<Branch> branchList = (List<Branch>) ibr.findAll();
		ModelMapper mm = new ModelMapper();
		List<BranchAllDto> branchAllDtoList = new ArrayList<BranchAllDto>();
		for (Branch branch : branchList) {
			BranchAllDto branchDto = mm.map(branch, BranchAllDto.class);
			branchAllDtoList.add(branchDto);
		}
		return branchAllDtoList;
	}

	@Override
	public BranchAllDto edit(int branchId) {
		Branch branch = (Branch) ibr.findById(branchId).get();
		ModelMapper mm = new ModelMapper();
		BranchAllDto branchAllDto = mm.map(branch, BranchAllDto.class);

		return branchAllDto;
	}

	@Override
	public void deleteBranch(int branchId) {

		ibr.deleteById(branchId);
		
	}

	@Override
	public Branch saveBranch(Branch br) {
		Branch branch = ibr.save(br);
		return branch;
	}
	
	//UserDetails Implementation

	@Override
	public UserDetails getUserDetail(int id) {
		UserDetails u=ur.findById(id).get();
		return u;
	}

	@Override
	public List<UserDetails> getAllUserDetails() {
		List<UserDetails> ul=(List<UserDetails>) ur.findAll();
		return ul;
	}

	@Override
	public UserDetails addUserDetails(UserDetails u) {
		UserDetails r=ur.save(u);
		return r;
	}

	@Override
	public UserDetails EditUserDetails(int id) {
		UserDetails kr=ur.findById(id).get();
		return kr;
	}

	@Override
	public void deleteUserDetails(int id) {
		ur.deleteById(id);
		
	}

	@Override
	public List<UserDetails> updateUserDetails(UserDetails u) {
		ur.save(u);
		List<UserDetails>ul=(List<UserDetails>) ur.findAll();
		return ul;
	}

}
