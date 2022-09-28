# RecipeRemover

## これはなに
[PaperMC/Paper](https://github.com/PaperMC/Paper) 対応のサーバプラグイン\
指定したアイテムのレシピを消すプラグインです

## Getting Started

### インストール
- [Releases](https://github.com/2mug1/RecipeRemover/releases) から Jar ファイルをダウンロードし、 `plugins` フォルダに入れます
- サーバ起動時、コンソール出力に異常がないことを確認してください

### 設定ファイル
`config.yml`
```yml
# クラフト禁止にしたいアイテムの org.bukkit.Material
materials:
  - STICK
```

## 技術スタック
- Java 18
- paper-api (1.19.2-R0.1-SNAPSHOT)

## 動作確認
- `Paper 1.19.2 #166` 確認済みです

## 注意
現在は開発バージョンのみリリースしています\
全ての処理や動作が正しく行われるとは限りません

## LICENSE
MIT License (© 2022- iamtakagi)\
See [LICENSE](./LICENSE)

## LICENSE (PaperMC/Paper)
See [Paper/LICENSE.md](https://github.com/PaperMC/Paper/blob/master/LICENSE.md) or [PaperMC/Paper/blob/master/LICENSE.md](https://github.com/PaperMC/Paper/blob/master/LICENSE.md)