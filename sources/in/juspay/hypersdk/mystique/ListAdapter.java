package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.core.Renderer;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ListAdapter extends BaseAdapter {
    private Context context;
    private float density;
    private final DuiCallback duiCallback;
    private JSONArray holderData;
    private JSONObject itemView;
    private Renderer renderer;
    private JSONArray rowData;
    private BitmapCache bitmapCache = BitmapCache.getInstance();
    private LruCache<String, Integer> colorCache = new LruCache<>(20);
    private LruCache<String, Drawable> drawableCache = new LruCache<>(50);
    private LruCache<String, Typeface> typefaceCache = new LruCache<>(20);
    private LruCache<String, Integer> typefaceWeightCache = new LruCache<>(20);

    /* loaded from: classes2.dex */
    public class Holder {
        View[] views;

        public Holder(View view) {
            this.views = new View[ListAdapter.this.holderData.length()];
            for (int i10 = 0; i10 < ListAdapter.this.holderData.length(); i10++) {
                try {
                    this.views[i10] = view.findViewById(ListAdapter.this.holderData.getJSONObject(i10).getInt("id"));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public ListAdapter(Context context, Renderer renderer, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, DuiCallback duiCallback) {
        this.renderer = renderer;
        this.rowData = jSONArray2;
        this.itemView = jSONObject;
        this.holderData = jSONArray;
        this.duiCallback = duiCallback;
        this.context = context;
        this.density = context.getResources().getDisplayMetrics().density;
    }

    private void applyUpdate(View view, JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        char c10;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = getString(jSONObject2, getString(jSONObject, next, HttpUrl.FRAGMENT_ENCODE_SET), getDefault(next, getString(jSONObject, next, HttpUrl.FRAGMENT_ENCODE_SET)));
            try {
                switch (next.hashCode()) {
                    case -1550943582:
                        if (next.equals("fontStyle")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -1351902487:
                        if (next.equals("onClick")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case -1332194002:
                        if (next.equals("background")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1003668786:
                        if (next.equals("textSize")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -859610604:
                        if (next.equals("imageUrl")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3556653:
                        if (next.equals("text")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 94842723:
                        if (next.equals("color")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 908612063:
                        if (next.equals("packageIcon")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1941332754:
                        if (next.equals("visibility")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        setBackground(view, string);
                        continue;
                    case 1:
                        setText(view, string);
                        continue;
                    case 2:
                        setTextColor(view, string);
                        continue;
                    case 3:
                        setImage(view, string);
                        continue;
                    case 4:
                        setVisibility(view, string);
                        continue;
                    case 5:
                        setFontStyle(view, string);
                        continue;
                    case 6:
                        setTextSize(view, string);
                        continue;
                    case 7:
                        setPackageIcon(view, string);
                        continue;
                    case '\b':
                        setAlpha(view, string);
                        continue;
                    case '\t':
                        setClickListener(view, string, i10);
                        continue;
                    default:
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(next, string);
                            if (this.duiCallback.getInflateView() == null) {
                                continue;
                            } else if (string == null) {
                                break;
                            } else {
                                this.duiCallback.getInflateView().putInState("view", view);
                                this.duiCallback.getInflateView().parseKeys(next, jSONObject3, view, false);
                                break;
                            }
                        } catch (Exception e10) {
                            this.duiCallback.getLogger().e("Error while adding properties to list item", e10.toString());
                            break;
                        }
                }
            } catch (Exception unused) {
            }
        }
    }

    private View createView() {
        try {
            return this.renderer.createView(this.itemView);
        } catch (Exception unused) {
            return null;
        }
    }

    private String getDefault(String str, String str2) {
        if (str.equals("onClick")) {
            return str2;
        }
        return null;
    }

    private String getString(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (Exception unused) {
            return str2;
        }
    }

    private void setAlpha(View view, String str) {
        view.setAlpha(Float.parseFloat(str));
    }

    private void setBackground(View view, String str) {
        if (str == null) {
            if (view.getBackground() instanceof GradientDrawable) {
                ((GradientDrawable) view.getBackground()).setColor(0);
            } else {
                view.setBackgroundDrawable(null);
            }
            view.setBackgroundDrawable(null);
            return;
        }
        Integer num = this.colorCache.get(str);
        if (num == null) {
            num = Integer.valueOf(Color.parseColor(str));
            this.colorCache.put(str, num);
        }
        Drawable background = view.getBackground();
        if (background == null || ((background instanceof ColorDrawable) && ((ColorDrawable) background).getColor() != num.intValue())) {
            view.setBackgroundColor(num.intValue());
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(num.intValue());
        }
    }

    private void setClickListener(View view, final String str, final int i10) {
        view.setOnClickListener(new View.OnClickListener() { // from class: in.juspay.hypersdk.mystique.ListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ListAdapter.this.duiCallback.addJsToWebView("window.callUICallback('" + str + "'," + i10 + ");");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:6:0x000d, B:8:0x0025, B:11:0x002d, B:13:0x0038, B:17:0x003e, B:19:0x0046, B:21:0x0052, B:34:0x01a8, B:36:0x01af, B:38:0x01bc, B:40:0x0096, B:51:0x00d1, B:52:0x00e3, B:53:0x00eb, B:54:0x00f3, B:55:0x00aa, B:58:0x00b4, B:61:0x00be, B:64:0x00fc, B:66:0x0108, B:68:0x0117, B:69:0x0121, B:70:0x0126, B:72:0x012c, B:73:0x013d, B:75:0x0145, B:77:0x0171, B:78:0x0181, B:79:0x006d, B:82:0x0077, B:85:0x0081, B:88:0x018c), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bc A[Catch: Exception -> 0x0035, TRY_LEAVE, TryCatch #0 {Exception -> 0x0035, blocks: (B:6:0x000d, B:8:0x0025, B:11:0x002d, B:13:0x0038, B:17:0x003e, B:19:0x0046, B:21:0x0052, B:34:0x01a8, B:36:0x01af, B:38:0x01bc, B:40:0x0096, B:51:0x00d1, B:52:0x00e3, B:53:0x00eb, B:54:0x00f3, B:55:0x00aa, B:58:0x00b4, B:61:0x00be, B:64:0x00fc, B:66:0x0108, B:68:0x0117, B:69:0x0121, B:70:0x0126, B:72:0x012c, B:73:0x013d, B:75:0x0145, B:77:0x0171, B:78:0x0181, B:79:0x006d, B:82:0x0077, B:85:0x0081, B:88:0x018c), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:6:0x000d, B:8:0x0025, B:11:0x002d, B:13:0x0038, B:17:0x003e, B:19:0x0046, B:21:0x0052, B:34:0x01a8, B:36:0x01af, B:38:0x01bc, B:40:0x0096, B:51:0x00d1, B:52:0x00e3, B:53:0x00eb, B:54:0x00f3, B:55:0x00aa, B:58:0x00b4, B:61:0x00be, B:64:0x00fc, B:66:0x0108, B:68:0x0117, B:69:0x0121, B:70:0x0126, B:72:0x012c, B:73:0x013d, B:75:0x0145, B:77:0x0171, B:78:0x0181, B:79:0x006d, B:82:0x0077, B:85:0x0081, B:88:0x018c), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setFontStyle(android.view.View r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.ListAdapter.setFontStyle(android.view.View, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c4 A[Catch: Exception -> 0x01d3, TryCatch #2 {Exception -> 0x01d3, blocks: (B:7:0x000d, B:10:0x001a, B:12:0x0022, B:13:0x003b, B:16:0x0049, B:18:0x006a, B:22:0x01c4, B:24:0x01cd, B:29:0x007c, B:41:0x00ba, B:43:0x00c4, B:45:0x00cb, B:46:0x00dc, B:47:0x00f7, B:49:0x0104, B:50:0x0120, B:52:0x0128, B:61:0x0150, B:63:0x015d, B:65:0x0167, B:67:0x017f, B:68:0x0194, B:70:0x01b3, B:71:0x018a, B:72:0x0093, B:75:0x009d, B:78:0x00a7), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120 A[Catch: Exception -> 0x01d3, TryCatch #2 {Exception -> 0x01d3, blocks: (B:7:0x000d, B:10:0x001a, B:12:0x0022, B:13:0x003b, B:16:0x0049, B:18:0x006a, B:22:0x01c4, B:24:0x01cd, B:29:0x007c, B:41:0x00ba, B:43:0x00c4, B:45:0x00cb, B:46:0x00dc, B:47:0x00f7, B:49:0x0104, B:50:0x0120, B:52:0x0128, B:61:0x0150, B:63:0x015d, B:65:0x0167, B:67:0x017f, B:68:0x0194, B:70:0x01b3, B:71:0x018a, B:72:0x0093, B:75:0x009d, B:78:0x00a7), top: B:6:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setImage(android.view.View r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.ListAdapter.setImage(android.view.View, java.lang.String):void");
    }

    private void setPackageIcon(View view, String str) {
        PackageManager packageManager = this.context.getPackageManager();
        ((ImageView) view).setImageDrawable(packageManager.getApplicationInfo(str, 0).loadIcon(packageManager));
    }

    private void setText(View view, String str) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getText().equals(str)) {
                return;
            }
            textView.setText(str);
        }
    }

    private void setTextColor(View view, String str) {
        TextView textView;
        int intValue;
        if (view instanceof TextView) {
            if (str == null) {
                textView = (TextView) view;
                intValue = -16777216;
            } else {
                Integer num = this.colorCache.get(str);
                if (num == null) {
                    num = Integer.valueOf(Color.parseColor(str));
                    this.colorCache.put(str, num);
                }
                textView = (TextView) view;
                intValue = num.intValue();
            }
            textView.setTextColor(intValue);
        }
    }

    private void setTextSize(View view, String str) {
        if (view instanceof TextView) {
            float parseInt = Integer.parseInt(str) * this.density;
            TextView textView = (TextView) view;
            if (textView.getTextSize() != parseInt) {
                textView.setTextSize(0, parseInt);
            }
        }
    }

    private void setVisibility(View view, String str) {
        view.setVisibility(str.equalsIgnoreCase("gone") ? 8 : str.equalsIgnoreCase("invisible") ? 4 : 0);
    }

    private void updateView(View view, int i10) {
        if (view.getTag() == null) {
            return;
        }
        Holder holder = (Holder) view.getTag();
        int i11 = 0;
        while (true) {
            View[] viewArr = holder.views;
            if (i11 >= viewArr.length) {
                return;
            }
            View view2 = viewArr[i11];
            if (view2 != null) {
                applyUpdate(view2, this.holderData.getJSONObject(i11), this.rowData.getJSONObject(i10), i10);
            }
            i11++;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.rowData.length();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = createView();
            if (view == null) {
                return new View(this.context);
            }
            view.setTag(new Holder(view));
        }
        try {
            updateView(view, i10);
        } catch (Exception unused) {
        }
        return view;
    }

    public void updateRowData(JSONArray jSONArray) {
        this.rowData = jSONArray;
    }
}
