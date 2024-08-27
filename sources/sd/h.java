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
public final class h extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupNameEditViewModel f34595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GroupNameEditViewModel groupNameEditViewModel, yt.a aVar) {
        super(2, aVar);
        this.f34595b = groupNameEditViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f34595b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List list;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34594a;
        GroupNameEditViewModel groupNameEditViewModel = this.f34595b;
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
                this.f34594a = 1;
                obj = chatRepository.getGroupTagList(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (list = (List) v0Var.f29303b) != null) {
                groupNameEditViewModel.f9211q.postValue(list);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
