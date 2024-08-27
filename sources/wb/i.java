package wb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i implements fi.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f38948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f38949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38950e;

    public /* synthetic */ i(Function0 function0, Function2 function2, String str, int i10) {
        this.f38947b = i10;
        this.f38948c = function0;
        this.f38949d = function2;
        this.f38950e = str;
    }

    @Override // fi.g
    public final void c() {
        int i10 = this.f38947b;
        String str = this.f38950e;
        Function2 function2 = this.f38949d;
        switch (i10) {
            case 0:
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, str);
                    return;
                }
                return;
            default:
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, str);
                    return;
                }
                return;
        }
    }

    @Override // fi.g
    public final void d() {
        int i10 = this.f38947b;
        Function0 function0 = this.f38948c;
        switch (i10) {
            case 0:
                function0.mo2invoke();
                return;
            default:
                function0.mo2invoke();
                return;
        }
    }

    @Override // fi.g
    public final void onPause() {
        int i10 = this.f38947b;
        String str = this.f38950e;
        Function2 function2 = this.f38949d;
        switch (i10) {
            case 0:
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, str);
                    return;
                }
                return;
            default:
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, str);
                    return;
                }
                return;
        }
    }
}
