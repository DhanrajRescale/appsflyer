package k2;

import android.graphics.text.LineBreakConfig;
import android.os.Bundle;
import android.text.StaticLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* synthetic */ LineBreakConfig.Builder b() {
        return new LineBreakConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ void d(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    public static /* bridge */ /* synthetic */ boolean e(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ Object g(Bundle bundle) {
        return bundle.getParcelable("LIST_OF_OPTIONS", ArenaSortOptions.class);
    }
}
