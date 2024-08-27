package d4;

import androidx.navigation.fragment.FragmentNavigator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13820c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f13818a = i10;
        this.f13819b = obj;
        this.f13820c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m event) {
        int i10 = this.f13818a;
        Object obj = this.f13820c;
        Object obj2 = this.f13819b;
        switch (i10) {
            case 0:
                v vVar = (v) obj2;
                x xVar = (x) obj;
                if (event == androidx.lifecycle.m.ON_DESTROY) {
                    vVar.b(xVar);
                    return;
                } else {
                    vVar.getClass();
                    return;
                }
            default:
                FragmentNavigator this$0 = (FragmentNavigator) obj2;
                androidx.navigation.n entry = (androidx.navigation.n) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(entry, "$entry");
                Intrinsics.checkNotNullParameter(tVar, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.m.ON_RESUME && ((List) this$0.b().f2282e.f36547a.getValue()).contains(entry)) {
                    this$0.b().b(entry);
                }
                if (event == androidx.lifecycle.m.ON_DESTROY && !((List) this$0.b().f2282e.f36547a.getValue()).contains(entry)) {
                    this$0.b().b(entry);
                    return;
                }
                return;
        }
    }
}
