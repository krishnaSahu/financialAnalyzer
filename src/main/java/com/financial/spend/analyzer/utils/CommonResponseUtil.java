package com.financial.spend.analyzer.utils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CommonResponseUtil {

	public static ResponseEntity<Object> getSuccessResponse(String key, Object value, String token) {

		Map<String, Object> commonResponse = new HashMap<>();

		commonResponse.put("statusCode", 200);
		commonResponse.put("token", token);
		commonResponse.put("message", "success");
		commonResponse.put(key, value);

		return new ResponseEntity<Object>(commonResponse, new HttpHeaders(), HttpStatus.OK);
	}

	public static ResponseEntity<Object> getFailResponse(String token, String customMsg, Integer customCode,
			HttpStatus message) {

		Map<String, Object> commonResponse = new HashMap<>();

		commonResponse.put("statusCode", customCode);
		commonResponse.put("token", token);
		commonResponse.put("message", customMsg);

		return new ResponseEntity<Object>(commonResponse, new HttpHeaders(), message);

	}

	public enum messageStatus {
		INSERT_SUCCESS(1, "INSERT_SUCCESS"), INSERT_ERROR(3, "INSERT_ERROR"), UPDATE_SUCCESS(2, "UPDATE_SUCCESS"),
		UPDATE_ERROR(4, "UPDATE_ERROR"), SESSION_CLEAR(5, "SESSION_CLEAR"), ALREADY_EXIST(6, "ALREADY_EXIST"),
		DELETE_SUCCESS(7, "DELETE_SUCCESS"), DELETE_ERROR(8, "DELETE_ERROR"), SUCCESS(200, "SUCCESS"),
		DATA_NOT_FOUND(404, "DATA_NOT_FOUND"), UNAUTHORIZED(401, "UNAUTHORIZED");

		private int messageCode;
		private String message;

		private messageStatus(int messageCode, String message) {

			this.messageCode = messageCode;
			this.message = message;
		}

		public int getMessageCode() {
			return messageCode;
		}

		public String getMessage() {
			return message;
		}

	}

	public enum roleType {

		SUPER_ADMIN(1, "Super Admin"), ADMIN(2, "Admin"), USER(3, "User");

		private int roleTypeId;
		private String roleType;

		private roleType(int roleTypeId, String roleType) {

			this.roleTypeId = roleTypeId;
			this.roleType = roleType;
		}

		public int getRoleTypeId() {
			return roleTypeId;
		}

		public String getRoleType() {
			return roleType;
		}

	}

	public static Object getfieldType(Integer fieldType) {

		Object fieldTypeClass = null;

		switch (fieldType) {
		case 1: // Text Box
			fieldTypeClass = String.class;
			break;
		case 2: // Numeric Text Box
			fieldTypeClass = Integer.class;
			break;
		case 3: // DatePicker Text Box
			fieldTypeClass = Date.class;
			break;
		case 4: // DropDown
			fieldTypeClass = Integer.class;
			break;
		case 5: // CheckBox
			fieldTypeClass = Boolean.class;
			break;
		case 6: // Numeric with Decimal Text
			fieldTypeClass = BigDecimal.class;
			break;
		default:
			fieldTypeClass = String.class;
			break;
		}

		return fieldTypeClass;
	}

	public enum artistType {

		ABSTRACT_PAINTING("Abstract Painting", "Abstract Painting"),
		ACCESSORIES_HANDMADE("Accessories Handmade", "Accessories Handmade"), ARTIFACTS("Artifacts", "Artifacts"),
		CHARCOAL_DRAWAING("Charcoal Drawing", "Charcoal Drawing"),
		CONTEMPORARY_PAINTING("Contemporary Painting", "Contemporary Painting"),
		FOLK_PAINTING("Folk Painting", "Folk Painting"), PENCIL_DRAWING("Pencil Drawings", "Pencil Drawings"),
		PRINTS("Prints", "Prints"), POTTERY("Pottery", "Pottery"),
		REALISTIC_PAITING("Realistic Painting", "Realistic Painting"), SCULPTURES("Sculptures", "Sculptures"),
		WATER_COLOR_LANDSCAPES("Watercolour Landscapes", "Watercolour Landscapes"),
		WATER_COLOR_PAITING("Watercolour Painting", "Watercolour Painting");

		private String artistTypeCode;
		private String artistTypeName;

		private artistType(String artistTypeCode, String artistTypeName) {

			this.artistTypeCode = artistTypeCode;
			this.artistTypeName = artistTypeName;
		}

		public String getArtistTypeCode() {
			return artistTypeCode;
		}

		public String getArtistTypeName() {
			return artistTypeName;
		}

	}
}
