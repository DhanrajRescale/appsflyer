package hj;

import android.webkit.WebChromeClient;
import fv.j;
import fv.n;
import iu.k;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class b extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(0);
        this.f18494a = i10;
        this.f18495b = obj;
    }

    public final void a() {
        int i10 = this.f18494a;
        Object obj = this.f18495b;
        switch (i10) {
            case 2:
                ((WebChromeClient.CustomViewCallback) obj).onCustomViewHidden();
                return;
            case 3:
            default:
                n nVar = (n) obj;
                nVar.f16336a++;
                nVar.f16339d.mo2invoke();
                return;
            case 4:
                ((fv.g) obj).d("timeout", new HashMap());
                return;
            case 5:
                ((j) obj).f16307b.b();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2invoke() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.b.mo2invoke():java.lang.Object");
    }
}
