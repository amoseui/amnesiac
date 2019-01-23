## vimrc
### case 관련 
```vim
set ignorecase
set smartcase
set infercase

" remove the traillings on save
autocmd BufWritePre * %s/\s\+$//e
```

### 단축키


### plugin
#### [tpope/vim-commentary](https://github.com/tpope/vim-commentary)
- `gcc` 현재 라인 주석 처리
- `gcgc` 현재 라인 주석 해제
- `:7,17Commentary` 7-17 라인 주석 처리


