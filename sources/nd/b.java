package nd;

import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.model.FollowerDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.ui.chat.create.members.create.MemberListViewModel;
import id.h;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jt.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ni.j;
import nt.f;
import okhttp3.HttpUrl;
import vt.g0;
import vt.z;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MemberListViewModel f28623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MemberListViewModel memberListViewModel, int i10) {
        super(1);
        this.f28622a = i10;
        this.f28623b = memberListViewModel;
    }

    public final void a(List list) {
        int i10 = this.f28622a;
        MemberListViewModel memberListViewModel = this.f28623b;
        switch (i10) {
            case 2:
                memberListViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                List list2 = memberListViewModel.f9131q;
                Intrinsics.c(list);
                ArrayList I = g0.I(list, list2);
                memberListViewModel.f9131q = I;
                ArrayList arrayList = new ArrayList(z.k(I));
                Iterator it = I.iterator();
                while (it.hasNext()) {
                    StockgroContact stockgroContact = (StockgroContact) it.next();
                    arrayList.add(new FollowerDto(stockgroContact.getName(), stockgroContact.getUuid(), stockgroContact.getDisplayPicture(), false, 8, null));
                }
                e0 e0Var = memberListViewModel.f9130p;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!Intrinsics.a(((FollowerDto) next).getUuid(), memberListViewModel.f9129o.getUserId())) {
                        arrayList2.add(next);
                    }
                }
                e0Var.postValue(arrayList2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberListViewModel memberListViewModel = this.f28623b;
        int i10 = this.f28622a;
        switch (i10) {
            case 0:
                List followers = (List) obj;
                Intrinsics.checkNotNullParameter(followers, "followers");
                List list = memberListViewModel.f9131q;
                ArrayList arrayList = new ArrayList(z.k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StockgroContact) it.next()).getUuid());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : followers) {
                    if (!arrayList.contains(((FollowerDto) obj2).getUuid())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(z.k(arrayList2));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    FollowerDto followerDto = (FollowerDto) it2.next();
                    arrayList3.add(new StockgroContact(followerDto.getName(), followerDto.getUuid(), HttpUrl.FRAGMENT_ENCODE_SET, followerDto.getDisplayPicture()));
                }
                return arrayList3;
            case 1:
                switch (i10) {
                    case 1:
                        memberListViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                    default:
                        memberListViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 2:
                a((List) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                a((List) obj);
                return Unit.f23355a;
            case 5:
                switch (i10) {
                    case 1:
                        memberListViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                    default:
                        memberListViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 6:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 7:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 8:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f28622a;
        MemberListViewModel memberListViewModel = this.f28623b;
        switch (i10) {
            case 6:
                memberListViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                if (baseResponseDto.getSuccess() && baseResponseDto.getData() != null) {
                    Iterable iterable = (Iterable) baseResponseDto.getData();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (true) {
                        int i11 = 1;
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (true ^ Intrinsics.a(((StockgroContact) next).getUuid(), memberListViewModel.f9129o.getUserId())) {
                                arrayList.add(next);
                            }
                        } else {
                            memberListViewModel.f9131q = arrayList;
                            ArrayList arrayList2 = new ArrayList(z.k(arrayList));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                StockgroContact stockgroContact = (StockgroContact) it2.next();
                                arrayList2.add(new FollowerDto(stockgroContact.getName(), stockgroContact.getUuid(), stockgroContact.getDisplayPicture(), false, 8, null));
                            }
                            memberListViewModel.f9130p.postValue(arrayList2);
                            m<BaseResponseDto<List<FollowerDto>>> friends = memberListViewModel.f9128n.getFriends();
                            h hVar = new h(20, a.f28619b);
                            friends.getClass();
                            nt.h c10 = new nt.b(new nt.b(new nt.b(new f(new f(friends, hVar, 1), new h(21, new b(memberListViewModel, 0)), 1), new h(22, new b(memberListViewModel, i11)), 1), new h(23, new b(memberListViewModel, 2)), 2), new h(24, new b(memberListViewModel, 3)), 0).c(((e) memberListViewModel.f9079b).J());
                            d dVar = new d(new h(25, new b(memberListViewModel, 4)), new h(26, a.f28620c));
                            c10.a(dVar);
                            memberListViewModel.f9080c.c(dVar);
                            return;
                        }
                    }
                } else {
                    memberListViewModel.f9083f.postValue(j.i(baseResponseDto.getMessage()));
                    return;
                }
                break;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f28622a;
        MemberListViewModel memberListViewModel = this.f28623b;
        switch (i10) {
            case 3:
                memberListViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 7:
                memberListViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                Intrinsics.c(th2);
                memberListViewModel.f9083f.postValue(j.i(ApiExceptionUtilitiesKt.extractMessage(th2)));
                th2.printStackTrace();
                return;
        }
    }
}
