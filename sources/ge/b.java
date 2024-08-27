package ge;

import com.assetgro.stockgro.ui.chat.helper.search.AssetUploadWorker;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class b implements le.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AssetUploadWorker f17303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f17304b;

    public b(AssetUploadWorker assetUploadWorker, Map map) {
        this.f17303a = assetUploadWorker;
        this.f17304b = map;
    }

    @Override // le.d
    public final void b() {
        Unit unit;
        AssetUploadWorker assetUploadWorker = this.f17303a;
        fv.e eVar = assetUploadWorker.f9348d;
        Map map = this.f17304b;
        if (eVar != null) {
            if (!eVar.a()) {
                AssetUploadWorker.b(assetUploadWorker, map);
            }
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            AssetUploadWorker.b(assetUploadWorker, map);
        }
    }

    @Override // le.d
    public final void e(boolean z10) {
        if (z10) {
            AssetUploadWorker.b(this.f17303a, this.f17304b);
        }
    }
}
