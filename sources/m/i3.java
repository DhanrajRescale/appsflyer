package m;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f25584a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f25585b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f25586c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f25587d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f25588e;

    public i3(View view) {
        this.f25584a = (TextView) view.findViewById(R.id.text1);
        this.f25585b = (TextView) view.findViewById(R.id.text2);
        this.f25586c = (ImageView) view.findViewById(R.id.icon1);
        this.f25587d = (ImageView) view.findViewById(R.id.icon2);
        this.f25588e = (ImageView) view.findViewById(com.assetgro.stockgro.prod.R.id.edit_query);
    }
}
