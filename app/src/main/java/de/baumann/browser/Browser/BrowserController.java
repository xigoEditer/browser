package de.baumann.browser.Browser;

import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;

public interface BrowserController {
    void updateAutoComplete();

    void updateBookmarks();

    void updateInputBox(String query);

    void updateProgress(int progress);

    void showAlbum(AlbumController albumController, boolean expand);

    void removeAlbum(AlbumController albumController);

    void showFileChooser(ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams);

    void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback);

    boolean onHideCustomView();

    void onLongPress(String url);

    void hideOverview ();
}
