package zc;

import android.widget.Toast;
import androidx.fragment.app.d1;
import com.assetgro.stockgro.data.ArenaAchievementShareDto;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f42379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.f42379a = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        ArenaAchievementShareDto.TemplateData templateData;
        ArenaAchievementShareDto arenaAchievementShareDto = (ArenaAchievementShareDto) obj;
        String str2 = null;
        if (arenaAchievementShareDto != null) {
            str = arenaAchievementShareDto.getUrl();
        } else {
            str = null;
        }
        if (arenaAchievementShareDto != null && (templateData = arenaAchievementShareDto.getTemplateData()) != null) {
            str2 = templateData.getTemplateBody();
        }
        i iVar = this.f42379a;
        d1 childFragmentManager = iVar.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (str != null && str2 != null) {
            int i10 = ad.g.f365e;
            bl.j.M(str, str2).show(childFragmentManager, "ShareYourAchievementDialog");
        } else {
            Toast.makeText(iVar.requireContext(), iVar.getString(R.string.try_again_later), 0).show();
        }
        return Unit.f23355a;
    }
}
