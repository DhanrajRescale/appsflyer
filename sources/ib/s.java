package ib;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.w4;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class s extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f19818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4 f19819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(RiaProfileActivity riaProfileActivity, qu.f0 f0Var, w4 w4Var) {
        super(3);
        this.f19817a = riaProfileActivity;
        this.f19818b = f0Var;
        this.f19819c = w4Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        String str;
        RiaProfileResponseDto.ExpertMeta expertMeta;
        b0.z ModalBottomSheetLayout = (b0.z) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if ((intValue & 81) == 16) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        RiaProfileActivity riaProfileActivity = this.f19817a;
        RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) riaProfileActivity.x()).f8798r.getValue();
        if (riaProfileResponseDto == null || (expertMeta = riaProfileResponseDto.getExpertMeta()) == null || (str = expertMeta.getName()) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        qu.f0 f0Var = this.f19818b;
        w4 w4Var = this.f19819c;
        yk.j.e(str2, false, new h(riaProfileActivity, f0Var, w4Var, 1), new j(2, w4Var, f0Var), nVar, 48, 0);
        return Unit.f23355a;
    }
}
