package vf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.yl;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f38026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f38025a = i10;
        this.f38026b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f38025a;
        c cVar = this.f38026b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                if (baseResponseDto.getSuccess()) {
                    ((yl) cVar.r()).f6749u.setVisibility(8);
                    ((WalletHomeViewModel) cVar.f38028i.getValue()).f9650p.postValue(Boolean.TRUE);
                    cVar.dismiss();
                } else if (baseResponseDto.getErrorCode().equals("429")) {
                    Context context = cVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                    String text = baseResponseDto.getMessage();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    }
                    cVar.dismiss();
                } else {
                    ((yl) cVar.r()).f6749u.setVisibility(0);
                    ((yl) cVar.r()).f6749u.setText(baseResponseDto.getMessage());
                    ((yl) cVar.r()).f6748t.textInput = HttpUrl.FRAGMENT_ENCODE_SET;
                    ((yl) cVar.r()).f6750v.setText(HttpUrl.FRAGMENT_ENCODE_SET, TextView.BufferType.EDITABLE);
                }
                return Unit.f23355a;
            case 1:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = cVar.f17276h;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = cVar.f17276h) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((yl) cVar.r()).f6749u.setVisibility(8);
                ((yl) cVar.r()).f6750v.setText(((yl) cVar.r()).f6748t.getTextInput(), TextView.BufferType.EDITABLE);
                return Unit.f23355a;
        }
    }
}
