package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;

/* loaded from: classes.dex */
public abstract class ae extends m4.m {
    public MissionsHomeViewModel A;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4182s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4183t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4184u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4185v;

    /* renamed from: w, reason: collision with root package name */
    public final RecyclerView f4186w;

    /* renamed from: x, reason: collision with root package name */
    public final ProgressBar f4187x;

    /* renamed from: y, reason: collision with root package name */
    public final NestedScrollView f4188y;

    /* renamed from: z, reason: collision with root package name */
    public final Space f4189z;

    public ae(Object obj, View view, TextView textView, ImageView imageView, TextView textView2, TextView textView3, RecyclerView recyclerView, ProgressBar progressBar, NestedScrollView nestedScrollView, Space space) {
        super(obj, view, 3);
        this.f4182s = textView;
        this.f4183t = imageView;
        this.f4184u = textView2;
        this.f4185v = textView3;
        this.f4186w = recyclerView;
        this.f4187x = progressBar;
        this.f4188y = nestedScrollView;
        this.f4189z = space;
    }
}
