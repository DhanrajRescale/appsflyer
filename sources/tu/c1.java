package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36419a;

    @Override // tu.b1
    public final f a(uu.c0 c0Var) {
        switch (this.f36419a) {
            case 0:
                return new j(z0.f36595a);
            default:
                return new j((Function2) new e1(c0Var, null));
        }
    }

    public final String toString() {
        switch (this.f36419a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
