package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.presentation.history.MissionStatusDetailViewModel;

/* loaded from: classes.dex */
public abstract class nk extends m4.m {
    public final TextView A;
    public MissionStatus B;
    public MissionStatusDetailViewModel C;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f5575s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f5576t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5577u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5578v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5579w;

    /* renamed from: x, reason: collision with root package name */
    public final Toolbar f5580x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f5581y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f5582z;

    public nk(Object obj, View view, RecyclerView recyclerView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, Toolbar toolbar, ConstraintLayout constraintLayout, ImageView imageView, TextView textView4) {
        super(obj, view, 3);
        this.f5575s = recyclerView;
        this.f5576t = progressBar;
        this.f5577u = textView;
        this.f5578v = textView2;
        this.f5579w = textView3;
        this.f5580x = toolbar;
        this.f5581y = constraintLayout;
        this.f5582z = imageView;
        this.A = textView4;
    }
}
