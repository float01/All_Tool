package com.sev.sevlocation.all_tool.CardView.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sev.sevlocation.all_tool.CardView.Adapter.SongAdapter;
import com.sev.sevlocation.all_tool.CardView.Entities.Song;
import com.sev.sevlocation.all_tool.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by SEV on 6/23/2017.
 */

public class SongActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public SongAdapter songAdapter;
    private List<Song> lsongs;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_2);
        ButterKnife.bind(this);
        recyclerView= (RecyclerView) findViewById(R.id.rcv_Song);
        lsongs=new ArrayList<>();
        lsongs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu một tình yêu Là lúc anh ", "Trịnh Đình Quang"));
        lsongs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        lsongs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        lsongs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        lsongs.add(new Song("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        lsongs.add(new Song("60685", "MỞ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        lsongs.add(new Song("60752", "TÌNH YÊU CHẮP VÁ", "Muốn đi xa nơi yêu thương mình từng có Để không nghe", "Mr. Siro"));
        lsongs.add(new Song("60608", "CHỜ NGÀY MƯA TAN", "Một ngày mưa và em khuất xa nơi anh bóng dáng cứ", "Trung Đức"));
        lsongs.add(new Song("60603", "CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em một lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        lsongs.add(new Song("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        lsongs.add(new Song("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thiện Ngôn"));
        songAdapter=new SongAdapter(lsongs,this);
        recyclerView.setAdapter(songAdapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
       ;
    }
}
