package ge;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.remote.response.ContactResponseDto;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchContactViewModel f17344b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(SearchContactViewModel searchContactViewModel, int i10) {
        super(1);
        this.f17343a = i10;
        this.f17344b = searchContactViewModel;
    }

    public final void a(ContactResponseDto contactResponseDto) {
        int i10 = this.f17343a;
        SearchContactViewModel searchContactViewModel = this.f17344b;
        switch (i10) {
            case 3:
                searchContactViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                if (contactResponseDto.getSuccess()) {
                    e0 e0Var = searchContactViewModel.f9359v;
                    Iterable iterable = (Iterable) contactResponseDto.getData();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        if (!Intrinsics.a(((NonStockgroContact) obj).getUuid(), searchContactViewModel.f9351n.getUserId())) {
                            arrayList.add(obj);
                        }
                    }
                    e0Var.postValue(arrayList);
                    if (contactResponseDto.getTotalRecords() != null && contactResponseDto.getTotalRecords().length() != 0) {
                        searchContactViewModel.D = Integer.parseInt(contactResponseDto.getTotalRecords());
                        return;
                    } else {
                        searchContactViewModel.D = 0;
                        return;
                    }
                }
                searchContactViewModel.f9083f.postValue(ni.j.i(contactResponseDto.getMessage()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17343a;
        SearchContactViewModel searchContactViewModel = this.f17344b;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                searchContactViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    searchContactViewModel.f9362y.postValue(group);
                }
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                if (searchContactViewModel.A) {
                    searchContactViewModel.f9084g.postValue(Boolean.TRUE);
                    searchContactViewModel.A = false;
                }
                return Unit.f23355a;
            case 3:
                a((ContactResponseDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                a((ContactResponseDto) obj);
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                searchContactViewModel.f9358u.postValue((List) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f17343a;
        SearchContactViewModel searchContactViewModel = this.f17344b;
        switch (i10) {
            case 1:
                searchContactViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                searchContactViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                Intrinsics.c(th2);
                searchContactViewModel.f9083f.postValue(ni.j.i(ApiExceptionUtilitiesKt.extractMessage(th2)));
                th2.printStackTrace();
                return;
        }
    }
}
