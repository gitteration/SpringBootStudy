// request === DTO 라고 생각하면 된다.
package com.springboot.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;


//@ToString
//@Set
//@Get
// ToString, Getter, Setter 자동완성 단축키
//      Windows -> alt + insert
//      Mac -> 후에 작성하겠음
// 혹은 만들어줄 필요없이 ToString, Set, Get 어노테이션을 선언하면 자동으로 주입하여 사용가능하다.
@Setter
@Getter
@ToString
public class PostCreate {
    @NotBlank   // 빈값 체크
    public String title;
    @NotBlank
    public String content;
    //
    //    public void setTitle(String title) {
    //        this.title = title;
    //    }
    //
    //    public void setContent(String content) {
    //        this.content = content;
    //    }

    // PostController에서 toString 메서드를 사용하기 때문에 만들어줘야 한다
    // 후에 테스트 코드를 실행해보면 해당 params가 null로 나오는데 set 메서드를 만들어주면 된다.
    //    @Override
    //    public String toString() {
    //        return "PostCreate{" +
    //                "title='" + title + '\'' +
    //                ", content='" + content + '\'' +
    //                '}';
    //    }
}
