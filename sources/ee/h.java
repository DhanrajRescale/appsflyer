package ee;

import au.i;
import com.assetgro.stockgro.data.model.UserGroupInfo;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailViewModel f15402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GroupDetailViewModel groupDetailViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f15402b = groupDetailViewModel;
        this.f15403c = str;
        this.f15404d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f15402b, this.f15403c, this.f15404d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15401a;
        GroupDetailViewModel groupDetailViewModel = this.f15402b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = groupDetailViewModel.f9328n;
                String str = this.f15403c;
                String str2 = this.f15404d;
                this.f15401a = 1;
                obj = chatRepository.joinSocialGroup(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                UserGroupInfo userGroupInfo = (UserGroupInfo) v0Var.f29303b;
                if (userGroupInfo != null) {
                    GroupDetailViewModel.h(groupDetailViewModel, userGroupInfo);
                }
            } else {
                groupDetailViewModel.f9336v.postValue(new z9.h(R.string.group_join_error, new Object[0]));
            }
            groupDetailViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            groupDetailViewModel.f9084g.postValue(Boolean.FALSE);
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
