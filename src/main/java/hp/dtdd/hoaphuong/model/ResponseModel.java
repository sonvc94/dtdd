package hp.dtdd.hoaphuong.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
//@AllArgsConstructor
public class ResponseModel {
    private Meta meta;
    private Object data;


    public ResponseModel(Meta meta, Object data){
        this.meta = meta;
        this.data = data;
    }

    public static ResponseModel success(Object data){
        Meta meta = Meta.builder()
                .code("00")
                .desc("Thanh cong")
                .build();
        return new ResponseModel(meta, data);
    }


    public static ResponseModel fail(Object data){
        Meta meta = Meta.builder()
                .code("99")
                .desc("Thai bai")
                .build();
        return new ResponseModel(meta, data);
    }

}
