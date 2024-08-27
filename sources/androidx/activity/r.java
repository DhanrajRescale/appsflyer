package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(w wVar, int i10) {
        super(0);
        this.f868a = i10;
        this.f869b = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        w wVar = this.f869b;
        int i10 = this.f868a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        wVar.d();
                        break;
                    default:
                        wVar.c();
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        wVar.d();
                        break;
                    default:
                        wVar.c();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
