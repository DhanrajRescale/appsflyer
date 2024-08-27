package pc;

import ad.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d1;
import bl.j;
import com.assetgro.stockgro.data.ArenaAchievementShareDto;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f30840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f30840a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        ArenaAchievementShareDto.TemplateData templateData;
        ArenaAchievementShareDto arenaAchievementShareDto = (ArenaAchievementShareDto) obj;
        if (arenaAchievementShareDto != null) {
            str = arenaAchievementShareDto.getUrl();
        } else {
            str = null;
        }
        if (arenaAchievementShareDto != null && (templateData = arenaAchievementShareDto.getTemplateData()) != null) {
            str2 = templateData.getTemplateBody();
        } else {
            str2 = null;
        }
        f fVar = this.f30840a;
        d1 childFragmentManager = fVar.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (str != null && str2 != null) {
            int i10 = g.f365e;
            j.M(str, str2).show(childFragmentManager, "ShareYourAchievementDialog");
        } else {
            Context context = fVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
            String text = fVar.getString(R.string.try_again_later);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            if (text.length() != 0) {
                Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                Object systemService = context.getSystemService("layout_inflater");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
            }
        }
        return Unit.f23355a;
    }
}
