package rh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ba.sm;
import com.assetgro.stockgro.prod.R;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f33754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f33753a = i10;
        this.f33754b = iVar;
    }

    public final void a(String text) {
        int i10 = this.f33753a;
        i iVar = this.f33754b;
        switch (i10) {
            case 2:
                Context context = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.c(text);
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
            default:
                Intrinsics.checkNotNullParameter(text, "text");
                Context context2 = iVar.getContext();
                if (context2 != null) {
                    Object systemService2 = context2.getSystemService("clipboard");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("text", text));
                    String string = iVar.getString(R.string.text_coupon_copied, text);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String text2 = a3.a.m(new Object[0], 0, string, "format(...)");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(text2, "text");
                    if (text2.length() != 0) {
                        Toast makeText2 = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService3 = context2.getSystemService("layout_inflater");
                        Intrinsics.d(systemService3, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate2 = ((LayoutInflater) systemService3).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33753a;
        i iVar = this.f33754b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    ((sm) iVar.q()).f6104s.f5657t.setVisibility(0);
                    ((sm) iVar.q()).f6104s.f5656s.setVisibility(8);
                    g gVar = iVar.f33756g;
                    if (gVar != null) {
                        gVar.u(list);
                    } else {
                        Intrinsics.k("redeemedOffersAdapter");
                        throw null;
                    }
                } else {
                    ((sm) iVar.q()).f6104s.f5657t.setVisibility(8);
                    ((sm) iVar.q()).f6104s.f5656s.setVisibility(0);
                }
                return Unit.f23355a;
            case 1:
                Boolean bool = (Boolean) obj;
                SwipeRefreshLayout swipeRefreshLayout = ((sm) iVar.q()).f6104s.f5659v;
                Intrinsics.c(bool);
                swipeRefreshLayout.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
