package mg;

import android.content.Context;
import b0.p1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import iu.k;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class e extends k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f27754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, int i10) {
        super(3);
        this.f27753a = i10;
        this.f27754b = context;
    }

    public final void a(p1 Button, n nVar, int i10) {
        l lVar = l.f16404b;
        int i11 = this.f27753a;
        Context context = this.f27754b;
        switch (i11) {
            case 2:
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                String string = context.getString(R.string.confirm_with_pin);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                b9.b(upperCase, androidx.compose.foundation.layout.a.t(lVar, 10), w0.e(R.color.white, nVar), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572912, 0, 131000);
                return;
            default:
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                String string2 = context.getString(R.string.cancel);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                b9.b(upperCase2, androidx.compose.foundation.layout.a.t(lVar, 10), w0.e(R.color.purpleSubmitBackground, nVar), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572912, 0, 131000);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f27753a) {
            case 0:
                d((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                d((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }

    public final void d(c0.c item, n nVar, int i10) {
        int i11 = this.f27753a;
        Context context = this.f27754b;
        switch (i11) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.u(androidx.compose.foundation.layout.d.f1286c, R.drawable.ic_empty_image_history, hl.f.c1(R.string.history_is_empty, nVar), hl.f.c1(R.string.fno_no_orders_text, nVar), hl.f.c1(R.string.add_options, nVar), new f9.a(context, 4), nVar, 54, 0);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                dp.b.u(null, R.drawable.ic_fno_image_orders, hl.f.c1(R.string.no_orders_yet, nVar), hl.f.c1(R.string.fno_no_orders_text, nVar), hl.f.c1(R.string.add_options, nVar), new f9.a(context, 5), nVar, 48, 1);
                return;
        }
    }
}
