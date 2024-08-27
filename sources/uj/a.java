package uj;

import android.view.View;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.stock_tag_edit_text.StockMentionableEditText;
import com.assetgro.stockgro.widget.stock_tag_edit_text.StockTagEditText;
import java.util.ArrayList;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a extends y1 implements View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final c f37221u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f37222v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, View itemView, c cVar) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f37222v = bVar;
        View findViewById = itemView.findViewById(R.id.tvSuggestionWord);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = itemView.findViewById(R.id.imgAvatar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f37221u = cVar;
        itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        int i10;
        Intrinsics.checkNotNullParameter(view, "view");
        c cVar = this.f37221u;
        if (cVar != null && (arrayList = this.f37222v.f37223d) != null && cVar != null) {
            Object obj = arrayList.get(e());
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            a3.a.u(obj);
            StockMentionableEditText stockMentionableEditText = (StockMentionableEditText) cVar;
            Intrinsics.checkNotNullParameter(null, "stock");
            StockTagEditText stockTagEditText = stockMentionableEditText.f10765c;
            Intrinsics.c(stockTagEditText);
            String valueOf = String.valueOf(stockTagEditText.getText());
            StockTagEditText stockTagEditText2 = stockMentionableEditText.f10765c;
            Intrinsics.c(stockTagEditText2);
            int currentCursorPosition = stockTagEditText2.getCurrentCursorPosition() - 1;
            StockTagEditText stockTagEditText3 = stockMentionableEditText.f10765c;
            Intrinsics.c(stockTagEditText3);
            String currentWord = stockTagEditText3.getCurrentWord();
            if (currentWord != null) {
                i10 = currentWord.length();
            } else {
                i10 = 0;
            }
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            for (int i11 = currentCursorPosition - i10; -1 < i11; i11--) {
                str2 = str2 + valueOf.charAt(i11);
            }
            StockTagEditText stockTagEditText4 = stockMentionableEditText.f10765c;
            Intrinsics.c(stockTagEditText4);
            int length = valueOf.length();
            for (int currentCursorPosition2 = stockTagEditText4.getCurrentCursorPosition() + 1; currentCursorPosition2 < length; currentCursorPosition2++) {
                str = str + valueOf.charAt(currentCursorPosition2);
            }
            throw null;
        }
    }
}
