package md;

import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.SocialCategoryDto;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f27711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GroupCreateViewModel groupCreateViewModel, int i10) {
        super(1);
        this.f27710a = i10;
        this.f27711b = groupCreateViewModel;
    }

    public final void a(Group group) {
        int i10 = this.f27710a;
        GroupCreateViewModel groupCreateViewModel = this.f27711b;
        switch (i10) {
            case 0:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                groupCreateViewModel.f9123v.postValue(group);
                return;
            default:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                groupCreateViewModel.f9122u.postValue(group);
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f27710a;
        GroupCreateViewModel groupCreateViewModel = this.f27711b;
        switch (i10) {
            case 1:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
            case 4:
            default:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 3:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 5:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f27710a;
        GroupCreateViewModel groupCreateViewModel = this.f27711b;
        switch (i10) {
            case 0:
                a((Group) obj);
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                a((Group) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                groupCreateViewModel.f9121t.postValue(((SocialCategoryDto) obj).getCategories());
                return Unit.f23355a;
            case 5:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 6:
                String url = ((AssetUploadResponse) obj).getUrl();
                if (url != null) {
                    if (groupCreateViewModel.f9126y == GroupImageType.Cover) {
                        groupCreateViewModel.f9125x = url;
                    } else {
                        groupCreateViewModel.f9124w = url;
                    }
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
