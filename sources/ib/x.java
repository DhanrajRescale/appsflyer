package ib;

import androidx.compose.ui.platform.ComposeView;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import vt.i0;
import y.q0;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f19832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f19833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RiaProfileResponseDto.Group f19834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ComposeView f19836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ArrayList arrayList, List list, RiaProfileResponseDto.Group group, RiaProfileActivity riaProfileActivity, ComposeView composeView) {
        super(2);
        this.f19832a = arrayList;
        this.f19833b = list;
        this.f19834c = group;
        this.f19835d = riaProfileActivity;
        this.f19836e = composeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        List list = this.f19832a;
        if (list == null) {
            list = i0.f38321a;
        }
        List list2 = this.f19833b;
        RiaProfileResponseDto.Group group = this.f19834c;
        RiaProfileActivity riaProfileActivity = this.f19835d;
        ComposeView composeView = this.f19836e;
        yb.u.d(null, false, list, list2, group, new q0(14, riaProfileActivity, composeView), new w(riaProfileActivity, composeView, 0), new w(riaProfileActivity, composeView, 1), new f(riaProfileActivity, 4), nVar, 4656, 1);
        return Unit.f23355a;
    }
}
