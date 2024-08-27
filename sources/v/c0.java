package v;

import android.net.Uri;
import android.view.View;
import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class c0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f37488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i10, Function1 function1) {
        super(1);
        this.f37487a = i10;
        this.f37488b = function1;
    }

    public final void a(String value) {
        int i10 = this.f37487a;
        Function1 function1 = this.f37488b;
        switch (i10) {
            case 16:
                Intrinsics.checkNotNullParameter(value, "value");
                List g10 = vt.y.g('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.');
                StringBuilder sb2 = new StringBuilder();
                int length = value.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = value.charAt(i11);
                    if (g10.contains(Character.valueOf(charAt))) {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                String obj = kotlin.text.w.X(sb3).toString();
                Double e10 = kotlin.text.q.e(obj);
                if (e10 != null) {
                    e10.doubleValue();
                    function1.invoke(obj);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(value, "orderId");
                function1.invoke(value);
                return;
        }
    }

    public final void d(th.b it) {
        int i10 = this.f37487a;
        Function1 function1 = this.f37488b;
        switch (i10) {
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(it);
                return;
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "card");
                function1.invoke(it);
                return;
        }
    }

    public final long e(long j10) {
        int i10 = this.f37487a;
        Function1 function1 = this.f37488b;
        switch (i10) {
            case 4:
                return hl.f.j(((Number) function1.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue(), 0);
            case 5:
                return hl.f.j(0, ((Number) function1.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue());
            default:
                return hl.f.j(((Number) function1.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue(), 0);
        }
    }

    public final long f(long j10) {
        int i10 = this.f37487a;
        Function1 function1 = this.f37488b;
        switch (i10) {
            case 0:
                return hl.f.k(((Number) function1.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue(), (int) (j10 & 4294967295L));
            case 1:
                return hl.f.k((int) (j10 >> 32), ((Number) function1.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue());
            case 2:
                return hl.f.k(((Number) function1.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue(), (int) (j10 & 4294967295L));
            default:
                return hl.f.k((int) (j10 >> 32), ((Number) function1.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        Object obj2;
        int i11 = this.f37487a;
        Object obj3 = null;
        switch (i11) {
            case 0:
                return new w2.j(f(((w2.j) obj).f38798a));
            case 1:
                return new w2.j(f(((w2.j) obj).f38798a));
            case 2:
                return new w2.j(f(((w2.j) obj).f38798a));
            case 3:
                return new w2.j(f(((w2.j) obj).f38798a));
            case 4:
                return new w2.h(e(((w2.j) obj).f38798a));
            case 5:
                return new w2.h(e(((w2.j) obj).f38798a));
            case 6:
                return new w2.h(e(((w2.j) obj).f38798a));
            case 7:
                long longValue = ((Number) obj).longValue();
                int i12 = this.f37487a;
                Function1 function1 = this.f37488b;
                switch (i12) {
                    case 7:
                        return function1.invoke(Long.valueOf(longValue));
                    default:
                        return function1.invoke(Long.valueOf(longValue / 1000000));
                }
            case 8:
                a3.a.u(obj);
                switch (this.f37487a) {
                    case 8:
                        throw null;
                    default:
                        throw null;
                }
            case 9:
            case 13:
            default:
                Throwable th2 = (Throwable) obj;
                Function1 function12 = this.f37488b;
                try {
                    l.Companion companion = ut.l.INSTANCE;
                    Throwable th3 = (Throwable) function12.invoke(th2);
                    boolean a10 = Intrinsics.a(th2.getMessage(), th3.getMessage());
                    obj2 = th3;
                    if (!a10) {
                        boolean a11 = Intrinsics.a(th3.getMessage(), th2.toString());
                        obj2 = th3;
                        if (!a11) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th4) {
                    l.Companion companion2 = ut.l.INSTANCE;
                    obj2 = ut.n.a(th4);
                }
                if (!(obj2 instanceof ut.m)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
            case 10:
                long longValue2 = ((Number) obj).longValue();
                int i13 = this.f37487a;
                Function1 function13 = this.f37488b;
                switch (i13) {
                    case 7:
                        return function13.invoke(Long.valueOf(longValue2));
                    default:
                        return function13.invoke(Long.valueOf(longValue2 / 1000000));
                }
            case 11:
                e1.n nVar = (e1.n) obj;
                synchronized (e1.p.f14905b) {
                    i10 = e1.p.f14907d;
                    e1.p.f14907d = i10 + 1;
                }
                return new e1.g(i10, nVar, this.f37488b);
            case 12:
                e1.i iVar = (e1.i) this.f37488b.invoke((e1.n) obj);
                synchronized (e1.p.f14905b) {
                    e1.p.f14906c = e1.p.f14906c.i(iVar.d());
                    Unit unit = Unit.f23355a;
                }
                return iVar;
            case 14:
                View view = (View) obj;
                Function1 function14 = this.f37488b;
                switch (i11) {
                    case 14:
                        Object tag = view.getTag(R.id.binding_reference);
                        Intrinsics.d(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                        function14.invoke((w7.a) tag);
                        break;
                    default:
                        Object tag2 = view.getTag(R.id.binding_reference);
                        Intrinsics.d(tag2, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                        function14.invoke((w7.a) tag2);
                        break;
                }
                return Unit.f23355a;
            case 15:
                View view2 = (View) obj;
                Function1 function15 = this.f37488b;
                switch (i11) {
                    case 14:
                        Object tag3 = view2.getTag(R.id.binding_reference);
                        Intrinsics.d(tag3, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                        function15.invoke((w7.a) tag3);
                        break;
                    default:
                        Object tag4 = view2.getTag(R.id.binding_reference);
                        Intrinsics.d(tag4, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                        function15.invoke((w7.a) tag4);
                        break;
                }
                return Unit.f23355a;
            case 16:
                a((String) obj);
                return Unit.f23355a;
            case 17:
                ReportReason it = (ReportReason) obj;
                Function1 function16 = this.f37488b;
                switch (i11) {
                    case 17:
                        Intrinsics.checkNotNullParameter(it, "it");
                        function16.invoke(it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "innerReportReason");
                        function16.invoke(it);
                        break;
                }
                return Unit.f23355a;
            case 18:
                Uri uri = (Uri) obj;
                Function1 function17 = this.f37488b;
                switch (i11) {
                    case 18:
                        if (uri != null) {
                            function17.invoke(uri);
                            break;
                        }
                        break;
                    default:
                        if (uri != null) {
                            function17.invoke(uri);
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            case 19:
                Uri uri2 = (Uri) obj;
                Function1 function18 = this.f37488b;
                switch (i11) {
                    case 18:
                        if (uri2 != null) {
                            function18.invoke(uri2);
                            break;
                        }
                        break;
                    default:
                        if (uri2 != null) {
                            function18.invoke(uri2);
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            case 20:
                OptionValue fnoValue = (OptionValue) obj;
                Function1 function19 = this.f37488b;
                switch (i11) {
                    case 20:
                        Intrinsics.checkNotNullParameter(fnoValue, "fnoValue");
                        function19.invoke(fnoValue);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(fnoValue, "it");
                        function19.invoke(fnoValue);
                        break;
                }
                return Unit.f23355a;
            case 21:
                OptionValue fnoValue2 = (OptionValue) obj;
                Function1 function110 = this.f37488b;
                switch (i11) {
                    case 20:
                        Intrinsics.checkNotNullParameter(fnoValue2, "fnoValue");
                        function110.invoke(fnoValue2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(fnoValue2, "it");
                        function110.invoke(fnoValue2);
                        break;
                }
                return Unit.f23355a;
            case 22:
                a((String) obj);
                return Unit.f23355a;
            case 23:
                d((th.b) obj);
                return Unit.f23355a;
            case 24:
                d((th.b) obj);
                return Unit.f23355a;
            case 25:
                d((th.b) obj);
                return Unit.f23355a;
            case 26:
                ReportReason it2 = (ReportReason) obj;
                Function1 function111 = this.f37488b;
                switch (i11) {
                    case 17:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        function111.invoke(it2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "innerReportReason");
                        function111.invoke(it2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
