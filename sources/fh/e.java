package fh;

import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.r0;
import ut.n;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMyProfileViewModel f16109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupMyProfileViewModel groupMyProfileViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f16109b = groupMyProfileViewModel;
        this.f16110c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f16109b, this.f16110c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16108a;
        GroupMyProfileViewModel groupMyProfileViewModel = this.f16109b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                xu.d dVar = r0.f32256b;
                d dVar2 = new d(groupMyProfileViewModel, this.f16110c, null);
                this.f16108a = 1;
                if (yk.g.e0(dVar, dVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupMyProfileViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
