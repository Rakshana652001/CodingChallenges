package com.chainsys.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test 
{
	public static void main(String args[])
	{
		Student stu1 = new Student("Rakshana", 22, new Address("534"), Arrays.asList(new MobileNumber("3453465")));
		Student stu2 = new Student("Saranya",22, new Address("54B"), Arrays.asList(new MobileNumber("3453465")));
		Student stu3 = new Student("Abi", 22, new Address("33S"), Arrays.asList(new MobileNumber("6345233")));
		
		
		List<Student> list = Arrays.asList(stu1,stu2,stu3);

        
		Optional<Student> student = list.stream().filter(std->std.getName().equals("Rakshana")).findFirst();
        System.out.println(student.isPresent()?student.get().getName():"NO");
        
        
        Optional<Student> getName = list.stream().filter(age->age.getName().equals("Saranya")).findFirst();
        System.out.println(getName.isPresent()?getName.get().getName().toUpperCase().concat("Saran"):"NO Record");
        
        
        Optional<Student> getaddress = list.stream().filter(getAd->getAd.getAddress().getZipcode().equals("33S")).findFirst();
        System.out.println(getaddress.isPresent()?getaddress.get().getAddress():"NO Record");
        
        Optional<Student> getAd = list.stream().filter(getAds->getAds.getAddress().getZipcode().equals("efs")).findFirst();
        System.out.println(getAd.isPresent()?getAd.get().getAddress():"NO Records");
        
        List<Student> getNumber = list.stream().filter(getNum->getNum.getMobileNumbers().stream().anyMatch(match->Objects.equals(match.getNumber(), "3453465"))).collect(Collectors.toList());
        String map = getNumber.stream().map(match -> match.getName()).collect(Collectors.joining(", ","[","]"));
      
        System.out.println(map);
        
        
        List<Student> lists = list.stream().filter(getNa->getNa.getMobileNumbers().stream().noneMatch(match->Objects.equals(match.getNumber(),"000"))).collect(Collectors.toList());
        String matc = lists.stream().map(mat->mat.getName()).collect(Collectors.joining(","," [","]"));
        System.out.println(matc);
        
        
        
        
		
	}

}
