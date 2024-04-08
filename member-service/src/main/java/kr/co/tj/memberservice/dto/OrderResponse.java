package kr.co.tj.memberservice.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String username;
	private String orderId;
	private String productId;
	private String artist;
	private String title;
	private String itemDescribe;
	private long qty;
	private long unitPrice;
	private long totalPrice;
	private Date createAt;
	private Date updateAt;
	// 0628_수령자 정보 추가
	private String receiver_name; // 수령자 이름
	private String receiver_phone;
	private String receiver_adress1; // 우편번호
	private String receiver_adress2; // 주소
	private String receiver_adress3; // 상세주소
	private String order_status; //주문상태 //결제완료, 배송중, 배송완료
	private String notes; //기타

}