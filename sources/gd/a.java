package gd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f17252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(1);
        this.f17251a = i10;
        this.f17252b = bVar;
    }

    public final void a(kj.h hVar) {
        int i10 = this.f17251a;
        b bVar = this.f17252b;
        switch (i10) {
            case 0:
                String str = (String) hVar.f23224b;
                if (str != null) {
                    bVar.J(str);
                    return;
                }
                return;
            default:
                Integer num = (Integer) hVar.f23224b;
                if (num != null) {
                    String string = bVar.getString(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    bVar.J(string);
                    return;
                }
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f17251a;
        b bVar = this.f17252b;
        switch (i10) {
            case 2:
                AnalyticEvent analyticEvent = (AnalyticEvent) jVar.a();
                if (analyticEvent != null) {
                    bVar.A(analyticEvent);
                    return;
                }
                return;
            case 3:
                AnalyticEvent analyticEvent2 = (AnalyticEvent) jVar.a();
                if (analyticEvent2 != null) {
                    bVar.E(analyticEvent2);
                    return;
                }
                return;
            case 4:
                AnalyticEvent analyticEvent3 = (AnalyticEvent) jVar.a();
                if (analyticEvent3 != null) {
                    bVar.C(analyticEvent3);
                    return;
                }
                return;
            case 5:
                AnalyticEvent analyticEvent4 = (AnalyticEvent) jVar.a();
                if (analyticEvent4 != null) {
                    bVar.D(analyticEvent4);
                    return;
                }
                return;
            default:
                if (((Unit) jVar.a()) != null) {
                    bVar.onBackPressed();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17251a) {
            case 0:
                a((kj.h) obj);
                return Unit.f23355a;
            case 1:
                a((kj.h) obj);
                return Unit.f23355a;
            case 2:
                d((kj.j) obj);
                return Unit.f23355a;
            case 3:
                d((kj.j) obj);
                return Unit.f23355a;
            case 4:
                d((kj.j) obj);
                return Unit.f23355a;
            case 5:
                d((kj.j) obj);
                return Unit.f23355a;
            case 6:
                d((kj.j) obj);
                return Unit.f23355a;
            default:
                String text = (String) obj;
                Context context = this.f17252b.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
        }
    }
}
