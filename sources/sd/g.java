package sd;

import au.i;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupNameEditViewModel f34591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f34593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GroupNameEditViewModel groupNameEditViewModel, String str, List list, yt.a aVar) {
        super(2, aVar);
        this.f34591b = groupNameEditViewModel;
        this.f34592c = str;
        this.f34593d = list;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f34591b, this.f34592c, this.f34593d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34590a;
        GroupNameEditViewModel groupNameEditViewModel = this.f34591b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = groupNameEditViewModel.f9208n;
                String str = groupNameEditViewModel.f9213s;
                String str2 = this.f34592c;
                List<String> list = this.f34593d;
                this.f34590a = 1;
                obj = chatRepository.editGroupNameAndTags(str, str2, list, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupNameEditViewModel.f9209o.postValue(Boolean.TRUE);
            }
            groupNameEditViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            e10.printStackTrace();
            groupNameEditViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
