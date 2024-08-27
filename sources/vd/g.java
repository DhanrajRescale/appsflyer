package vd;

import android.view.View;
import ba.db;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f37974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(1);
        this.f37973a = i10;
        this.f37974b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37973a;
        h hVar = this.f37974b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                boolean z10 = hVar.B;
                m4.m mVar = hVar.f17291u;
                if (z10) {
                    String str2 = hVar.f37975x;
                    if (Intrinsics.a(str, str2)) {
                        ((db) mVar).f4471v.setVisibility(8);
                    }
                    if (Intrinsics.a(str, str2)) {
                        ((db) mVar).f4469t.setVisibility(8);
                    }
                } else {
                    db dbVar = (db) mVar;
                    dbVar.f4471v.setVisibility(8);
                    dbVar.f4469t.setVisibility(8);
                }
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                boolean z11 = hVar.C;
                m4.m mVar2 = hVar.f17291u;
                if (z11) {
                    View view = ((db) mVar2).f4468s;
                    Intrinsics.c(bool);
                    view.setVisibility(el.l.u(bool.booleanValue()));
                } else {
                    ((db) mVar2).f4468s.setVisibility(0);
                }
                return Unit.f23355a;
        }
    }
}
