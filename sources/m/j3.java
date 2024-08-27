package m;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.assetgro.stockgro.prod.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j3 extends i4.a implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f25595x = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f25596h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25597i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f25598j;

    /* renamed from: k, reason: collision with root package name */
    public final SearchView f25599k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchableInfo f25600l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f25601m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f25602n;

    /* renamed from: o, reason: collision with root package name */
    public final int f25603o;

    /* renamed from: p, reason: collision with root package name */
    public int f25604p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f25605q;

    /* renamed from: r, reason: collision with root package name */
    public int f25606r;

    /* renamed from: s, reason: collision with root package name */
    public int f25607s;

    /* renamed from: t, reason: collision with root package name */
    public int f25608t;

    /* renamed from: u, reason: collision with root package name */
    public int f25609u;

    /* renamed from: v, reason: collision with root package name */
    public int f25610v;

    /* renamed from: w, reason: collision with root package name */
    public int f25611w;

    public j3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f19335b = true;
        this.f19336c = null;
        this.f19334a = false;
        this.f19337d = -1;
        this.f19338e = new d2.d4(this);
        this.f19339f = new f2(this, 1);
        this.f25597i = suggestionRowLayout;
        this.f25596h = suggestionRowLayout;
        this.f25598j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f25604p = 1;
        this.f25606r = -1;
        this.f25607s = -1;
        this.f25608t = -1;
        this.f25609u = -1;
        this.f25610v = -1;
        this.f25611w = -1;
        this.f25599k = searchView;
        this.f25600l = searchableInfo;
        this.f25603o = searchView.getSuggestionCommitIconResId();
        this.f25601m = context;
        this.f25602n = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    @Override // i4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.j3.a(android.view.View, android.database.Cursor):void");
    }

    @Override // i4.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f25606r = cursor.getColumnIndex("suggest_text_1");
                this.f25607s = cursor.getColumnIndex("suggest_text_2");
                this.f25608t = cursor.getColumnIndex("suggest_text_2_url");
                this.f25609u = cursor.getColumnIndex("suggest_icon_1");
                this.f25610v = cursor.getColumnIndex("suggest_icon_2");
                this.f25611w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // i4.a
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.f25600l;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // i4.a
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f25598j.inflate(this.f25596h, viewGroup, false);
        inflate.setTag(new i3(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f25603o);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f25601m.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(jr.h.p("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(jr.h.p("More than two path segments: ", uri));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(jr.h.p("No resource found for: ", uri));
                }
                throw new FileNotFoundException(jr.h.p("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(jr.h.p("No package found for authority: ", uri));
            }
        }
        throw new FileNotFoundException(jr.h.p("No authority: ", uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.j3.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(HttpUrl.FRAGMENT_ENCODE_SET).fragment(HttpUrl.FRAGMENT_ENCODE_SET);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f25601m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // i4.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f25598j.inflate(this.f25597i, viewGroup, false);
            if (inflate != null) {
                ((i3) inflate.getTag()).f25584a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // i4.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d10 = d(viewGroup);
            ((i3) d10.getTag()).f25584a.setText(e10.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f19336c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f19336c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f25599k.r((CharSequence) tag);
        }
    }
}
