package lf;

import com.assetgro.stockgro.data.model.homedata.ListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24738a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListItem f24739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f24740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ListItem listItem, m mVar, int i10) {
        super(0);
        this.f24739b = listItem;
        this.f24740c = mVar;
        this.f24741d = i10;
    }

    public final void a() {
        int i10 = this.f24738a;
        int i11 = this.f24741d;
        m mVar = this.f24740c;
        ListItem listItem = this.f24739b;
        switch (i10) {
            case 0:
                mVar.f24747e.invoke(listItem.getRedirectionUrl(), Integer.valueOf(i11 % mVar.f24746d.size()));
                return;
            default:
                String buttonDeeplink = listItem.getButtonDeeplink();
                if (buttonDeeplink != null) {
                    mVar.f24747e.invoke(buttonDeeplink, Integer.valueOf(i11 % mVar.f24746d.size()));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24738a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, ListItem listItem, int i10) {
        super(0);
        this.f24740c = mVar;
        this.f24739b = listItem;
        this.f24741d = i10;
    }
}
