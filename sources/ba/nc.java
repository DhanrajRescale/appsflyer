package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.ui.chat.search.groups.GroupSearchItemViewModel;
import com.assetgro.stockgro.widget.GroupTagsView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class nc extends m4.m {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f5554z = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f5555s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5556t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5557u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5558v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f5559w;

    /* renamed from: x, reason: collision with root package name */
    public final GroupTagsView f5560x;

    /* renamed from: y, reason: collision with root package name */
    public GroupSearchItemViewModel f5561y;

    public nc(Object obj, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, MaterialButton materialButton, GroupTagsView groupTagsView) {
        super(obj, view, 8);
        this.f5555s = imageView;
        this.f5556t = textView;
        this.f5557u = textView2;
        this.f5558v = textView3;
        this.f5559w = materialButton;
        this.f5560x = groupTagsView;
    }
}
