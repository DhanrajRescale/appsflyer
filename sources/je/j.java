package je;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.data.model.UserChatGroupsResponse;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.list.UserGroupListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f21337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserGroupListViewModel f21338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(UserGroupListViewModel userGroupListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f21338b = userGroupListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f21338b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f21337a;
        UserGroupListViewModel userGroupListViewModel = this.f21338b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = userGroupListViewModel.f9399n;
                int i11 = userGroupListViewModel.f9406u;
                this.f21337a = 1;
                obj = chatRepository.getChatGroups(i11, 0, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                e0 e0Var = userGroupListViewModel.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                UserChatGroupsResponse userChatGroupsResponse = (UserChatGroupsResponse) v0Var.f29303b;
                if (userChatGroupsResponse != null) {
                    userGroupListViewModel.f9084g.postValue(bool);
                    List<UserChatGroup> memberGroups = userChatGroupsResponse.getMemberGroups();
                    if (memberGroups != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<UserChatGroup> it = memberGroups.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ChatChannel(it.next(), false));
                        }
                        userGroupListViewModel.f9401p.postValue(arrayList);
                    }
                    Boolean endOfResponse = userChatGroupsResponse.getEndOfResponse();
                    if (endOfResponse != null) {
                        endOfResponse.booleanValue();
                    }
                }
            } else {
                userGroupListViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, userGroupListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
