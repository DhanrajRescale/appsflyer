package ze;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.rate.RateAppActivity;
import com.kaopiz.kprogresshud.f;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RateAppActivity f42439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RateAppActivity rateAppActivity, int i10) {
        super(1);
        this.f42438a = i10;
        this.f42439b = rateAppActivity;
    }

    public final void a(Boolean bool) {
        f fVar;
        int i10 = this.f42438a;
        RateAppActivity context = this.f42439b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    f fVar2 = context.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = context.f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    context.finish();
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    String text = context.getString(R.string.error_submit_feedback);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f42438a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
