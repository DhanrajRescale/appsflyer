package vg;

import ba.fg;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f38039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f38038a = i10;
        this.f38039b = cVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f38038a;
        c cVar = this.f38039b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((fg) cVar.r()).f4707y.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((fg) cVar.r()).f4707y.setVisibility(8);
                        return;
                    }
                    return;
                }
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((fg) cVar.r()).f4708z.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((fg) cVar.r()).f4708z.setVisibility(8);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f38038a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
