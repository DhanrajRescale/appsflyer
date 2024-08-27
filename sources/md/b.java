package md;

import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import iu.k;
import kotlin.jvm.functions.Function0;
import okhttp3.HttpUrl;
import ue.a0;
import ue.y;

/* loaded from: classes.dex */
public final class b extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f27713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GroupCreateViewModel groupCreateViewModel, String str, int i10) {
        super(0);
        this.f27712a = i10;
        this.f27713b = groupCreateViewModel;
        this.f27714c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        GroupCreateViewModel groupCreateViewModel = this.f27713b;
        String str = this.f27714c;
        int i10 = this.f27712a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return new y(groupCreateViewModel.f9115n, str, HttpUrl.FRAGMENT_ENCODE_SET);
                    default:
                        return new a0(groupCreateViewModel.f9115n, str, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            default:
                switch (i10) {
                    case 0:
                        return new y(groupCreateViewModel.f9115n, str, HttpUrl.FRAGMENT_ENCODE_SET);
                    default:
                        return new a0(groupCreateViewModel.f9115n, str, HttpUrl.FRAGMENT_ENCODE_SET);
                }
        }
    }
}
