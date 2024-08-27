package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public abstract class na extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final Chip f5538s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5539t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5540u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5541v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5542w;

    /* renamed from: x, reason: collision with root package name */
    public final Chip f5543x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f5544y;

    /* renamed from: z, reason: collision with root package name */
    public ArenaGame f5545z;

    public na(Object obj, View view, Chip chip, ImageView imageView, TextView textView, TextView textView2, TextView textView3, Chip chip2, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f5538s = chip;
        this.f5539t = imageView;
        this.f5540u = textView;
        this.f5541v = textView2;
        this.f5542w = textView3;
        this.f5543x = chip2;
        this.f5544y = constraintLayout;
    }

    public abstract void r(ArenaGame arenaGame);
}
