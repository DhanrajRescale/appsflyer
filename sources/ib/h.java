package ib;

import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m0.w4;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f19788c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f19789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(RiaProfileActivity riaProfileActivity, qu.f0 f0Var, w4 w4Var, int i10) {
        super(0);
        this.f19786a = i10;
        this.f19787b = riaProfileActivity;
        this.f19788c = f0Var;
        this.f19789d = w4Var;
    }

    public final void a() {
        qu.f0 f0Var = this.f19788c;
        int i10 = this.f19786a;
        w4 w4Var = this.f19789d;
        RiaProfileActivity riaProfileActivity = this.f19787b;
        switch (i10) {
            case 0:
                ((RiaProfileViewModel) riaProfileActivity.x()).h(((RiaProfileViewModel) riaProfileActivity.x()).f8804x, true);
                yk.g.H(f0Var, null, null, new g(w4Var, null), 3);
                return;
            default:
                ((RiaProfileViewModel) riaProfileActivity.x()).h(((RiaProfileViewModel) riaProfileActivity.x()).f8804x, false);
                yk.g.H(f0Var, null, null, new q(w4Var, null), 3);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f19786a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
