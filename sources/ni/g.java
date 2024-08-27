package ni;

import android.os.Bundle;
import com.assetgro.stockgro.data.AnalyticEvent;
import ej.t0;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements ck.a, dk.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28733a;

    public /* synthetic */ g(int i10) {
        this.f28733a = i10;
    }

    public static aj.c c(zi.k data) {
        Intrinsics.checkNotNullParameter(data, "data");
        aj.c cVar = new aj.c();
        cVar.setArguments(hl.f.y(new Pair("DATA", data)));
        return cVar;
    }

    public static ej.p d(String str, AnalyticEvent actionAnalyticEvent) {
        Intrinsics.checkNotNullParameter(actionAnalyticEvent, "actionAnalyticEvent");
        Bundle bundle = new Bundle();
        ej.p pVar = new ej.p();
        bundle.putString("DATA", str);
        bundle.putSerializable("ANALYTIC_EVENT", actionAnalyticEvent);
        pVar.setArguments(bundle);
        return pVar;
    }

    public static t0 e(String str, AnalyticEvent primaryActionAnalyticEvent) {
        Intrinsics.checkNotNullParameter(primaryActionAnalyticEvent, "primaryActionAnalyticEvent");
        Bundle bundle = new Bundle();
        t0 t0Var = new t0();
        bundle.putString("DATA", str);
        bundle.putSerializable("ANALYTIC_EVENT", primaryActionAnalyticEvent);
        t0Var.setArguments(bundle);
        return t0Var;
    }

    public static ej.p f(String str, AnalyticEvent actionAnalyticEvent) {
        Intrinsics.checkNotNullParameter(actionAnalyticEvent, "actionAnalyticEvent");
        Bundle bundle = new Bundle();
        ej.p pVar = new ej.p();
        bundle.putString("DATA", str);
        bundle.putSerializable("ANALYTIC_EVENT", actionAnalyticEvent);
        bundle.putBoolean("BACK_PRESS_ALLOWED", true);
        pVar.setArguments(bundle);
        return pVar;
    }

    @Override // ck.a
    public final void a(xj.g gVar, ak.k kVar) {
    }

    @Override // ck.a
    public final File b(xj.g gVar) {
        return null;
    }

    @Override // dk.b
    public final void l(Throwable th2) {
        throw new RuntimeException("Request threw uncaught throwable", th2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        this(0);
        this.f28733a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            default:
                return;
        }
    }
}
